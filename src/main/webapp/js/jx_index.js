//模糊查询
$("#jx_submit").click(function (event) {
    event.preventDefault();
    var text = $("#jx_text").val();
    $.ajax({
        type: 'POST',
        url: 'article/getIdByTitleDim',
        data: "text=" + text + "&pageNum=0&pageSize=10",
        success: function (response) {
            change(response.list, "搜索:" + text);
            layui.use(['laypage', 'layer'], function () {
                var laypage = layui.laypage
                    , layer = layui.layer;
                laypage.render({
                    elem: 'pageHelper'
                    , count: response.total
                    , limit: response.pageSize
                    , curr: response.pageNum
                    , layout:
                        ['count', 'prev', 'page', 'next', 'skip']
                    , jump:
                        function (obj) {
                            console.log(obj);
                            $.ajax({
                                type: 'POST',
                                url: 'article/getIdByTitleDim',
                                data: "text=" + text + "&pageNum=" + obj.curr + "&pageSize=10",
                                success: function (response) {
                                    change(response.list, "搜索:" + text);
                                },
                                error: function (response) {
                                    console.log(response)
                                }
                            })
                        }
                })
                ;

            });
        },
        error: function (response) {
            console.log(response)
        }
    })
});
$(function () {
    //清空标签集
    $("#clear").click(function () {
        $(".otag").remove();
    });
    //类别查询
    $("#pp a").click(function (event) {
        event.preventDefault();
        var category = $(this).find("font").find("font").html();
        $.ajax({
            type: 'POST',
            url: 'article/getArticleIdByCategoryName',
            data: "categoryName=" + category + "&pageNum=1&pageSize=10",
            success: function (response) {
                change(response.list, category);
                layui.use(['laypage', 'layer'], function () {
                    var laypage = layui.laypage
                        , layer = layui.layer;
                    laypage.render({
                        elem: 'pageHelper'
                        , count: response.total
                        , limit: response.pageSize
                        , curr: response.pageNum
                        , layout:
                            ['count', 'prev', 'page', 'next', 'skip']
                        , jump:
                            function (obj) {
                                console.log(obj);
                                $.ajax({
                                    type: 'POST',
                                    url: 'article/getArticleIdByCategoryName',
                                    data: "categoryName=" + category + "&pageNum=" + obj.curr + "&pageSize=10",
                                    success: function (response) {
                                        change(response.list, category);
                                    },
                                    error: function (response) {
                                        console.log(response)
                                    }
                                })
                            }
                    })
                    ;

                });
            },
            error: function (response) {
                console.log(response)
            }
        })
    });


});
//热门标签
$(function () {
    //热门标签初始化,前十
    $.ajax({
        type: 'POST',
        url: 'article/getTag',
        data: "pageNum=0&pageSize=10",
        success: function (response) {
            var string = "";
            $(response.list).each(function (index, item) {
                string += "<li ><a onclick='query(\"" + item.tagName + "\")' class='tag'><font style=\"vertical-align: inherit;\"><font style=\"vertical-align: inherit;\">" + item.tagName + "</font></font></a></li>";
            });
            $("#jx_hotTag").html(string);
        },
        error: function (response) {
            console.log(response)
        }
    });

});

/**
 * 添加顶部标签,并根据标签集进行查询
 * @param tagName 标签名
 */
function query(tagName) {
    $("<a onclick='del(this)' class=\"otag btn color-6 size-3 hover-10\"><font style=\"vertical-align: inherit;\"><font class='getTagName' style=\"vertical-align: inherit;\">" + tagName + "</font></font><i class=\"fa keyword fa-times\"></i></a>").insertAfter($("#clear"));
    var string = "";
    $(".getTagName").each(function () {
        string += $(this).html() + "_";
    });
    $.ajax({
        type: 'POST',
        url: 'article/getArticleInfoIdByTagName',
        data: "tagName=" + string + "&pageNum=1&pageSize=10",
        success: function (response) {
            change(response.list, "标签查询");
            layui.use(['laypage', 'layer'], function () {
                var laypage = layui.laypage
                    , layer = layui.layer;
                laypage.render({
                    elem: 'pageHelper'
                    , count: response.total
                    , limit: response.pageSize
                    , curr: response.pageNum
                    , layout:
                        ['count', 'prev', 'page', 'next', 'skip']
                    , jump:
                        function (obj) {
                            console.log(obj);
                            $.ajax({
                                type: 'POST',
                                url: 'tag/getArticleInfoIds',
                                data: "tagName=" + string + "&pageNum=" + obj.curr,
                                success: function (response) {
                                    change(response.list, "标签查询");
                                },
                                error: function (response) {
                                    console.log(response)
                                }
                            })
                        }
                })
                ;

            });
        },
        error: function (response) {
            console.log(response)
        }
    })
}

/**
 * 删除顶部标签,并重新查询标签集
 * @param my 被删除的标签
 */
function del(my) {
    my.parentNode.removeChild(my);
    var string = "";
    $(".getTagName").each(function () {
        string += $(this).html() + "_";
    });
    $.ajax({
        type: 'POST',
        url: 'article/getArticleInfoIdByTagName',
        data: "tagName=" + string + "&pageNum=1&pageSize=10",
        success: function (response) {
            change(response.list, "标签结果");
           /* changePage(response.list, 'article/getArticleInfoIdByTagName', "标签结果", "tagName=" + string + "&pageSize=10")*/
            layui.use(['laypage', 'layer'], function () {
                var laypage = layui.laypage
                    , layer = layui.layer;
                laypage.render({
                    elem: 'pageHelper'
                    , count: response.total
                    , limit: response.pageSize
                    , curr: response.pageNum
                    , layout:
                        ['count', 'prev', 'page', 'next', 'skip']
                    , jump:
                        function (obj) {
                            console.log(obj);
                            $.ajax({
                                type: 'POST',
                                url: 'article/getArticleInfoIdByTagName',
                                data: "tagName=" + string + "&pageNum="+obj.curr+"&pageSize=10",
                                success: function (response) {
                                    change(response.list,"标签结果");
                                },
                                error: function (response) {
                                    console.log(response)
                                }
                            })
                        }
                })
                ;
            });
        },
        error: function (response) {
            console.log(response)
        }
    })
}

/**
 * 根据ids请求服务器表格信息列表
 * @param response ids
 * @param tagName 标题
 */
function change(response, tagName) {
    {
        console.log(response);
        $.ajax({
            type: 'POST',
            url: 'article/getArticleInfoByIds',
            data: "ids=" + response,
            success: function (response) {
                var k = "<div class=\"row _post-container_\">\n" +
                    "                    <h1>" + tagName + "</h1>\n" +
                    "                    <HR style=\"FILTER: progid:DXImageTransform.Microsoft.Shadow(color:#987cb9,direction:145,strength:15)\"\n" +
                    "                        width=\"100%\" color=#987cb9 SIZE=3>\n" +
                    "                    <div>\n";
                $(response).each(function (index, item) {
                    k +=
                        "                        <div class=\"custom-column-5\">\n" +
                        "                            <div class=\"be-post\">\n" +
                        "                                <a href=\"blog-detail-2.html?articleId="+item.articleId+"\" class=\"be-img-block\">\n" +
                        "                                    <img src='" + item.potoPath + "' alt=\"我的天啊\">\n" +
                        "                                </a>\n" +
                        "                                <a href=\"blog-detail-2.html\articleId="+item.articleId+"\" class=\"be-post-title\"><font\n" +
                        "                                        style=\"vertical-align: inherit;\"><font\n" +
                        "                                        style=\"vertical-align: inherit;\">" + item.title + "</font></font></a>\n" +
                        "                                <font style=\"vertical-align: inherit;\"><span><a href=\"blog-detail-2.html\"\n" +
                        "                                                                                class=\"be-post-tag\"><font\n" +
                        "                                        style=\"vertical-align: inherit;\">" + item.categoryName + "</font></a></span><a\n" +
                        "                                        href=\"blog-detail-2.html\" class=\"be-post-title\"><font\n" +
                        "                                        style=\"vertical-align: inherit;\"></font></a></font><span>\n" +
                        "\t\t\t\t\t\t\t\t\t\t<a href=\"blog-detail-2.html\" class=\"be-post-tag\"><font\n" +
                        "                                                style=\"vertical-align: inherit;\"></font></a><font\n" +
                        "                                    style=\"vertical-align: inherit;\"></font><a href=\"blog-detail-2.html\"\n" +
                        "                                                                               class=\"be-post-tag\"><font\n" +
                        "                                    style=\"vertical-align: inherit;\"></font></a><font\n" +
                        "                                    style=\"vertical-align: inherit;\"></font><a href=\"blog-detail-2.html\"\n" +
                        "                                                                               class=\"be-post-tag\"><font\n" +
                        "                                    style=\"vertical-align: inherit;\"></font></a>\n" +
                        "\t\t\t\t\t\t\t\t\t</span>\n" +
                        "                                <div class=\"author-post\">\n" +
                        "                                    <img src='" + item.headPath + "' alt=\"\" class=\"ava-author\">\n" +
                        "                                    <span><font style=\"vertical-align: inherit;\"><font style=\"vertical-align: inherit;\">作者：</font></font><a\n" +
                        "                                            href=\"author.html?userInfoId="+item.userInfoId+"\"><font style=\"vertical-align: inherit;\"><font\n" +
                        "                                            style=\"vertical-align: inherit;\">" + item.username + "</font></font></a></span>\n" +
                        "                                </div>\n" +
                        "                                <div class=\"info-block\">\n" +
                        "                                    <span><i class=\"fa fa-thumbs-o-up\"></i><font style=\"vertical-align: inherit;\"><font\n" +
                        "                                            style=\"vertical-align: inherit;\"> " + item.support + "</font></font></span>\n" +
                        "                                    <span><i class=\"fa fa-eye\"></i><font style=\"vertical-align: inherit;\"><font\n" +
                        "                                            style=\"vertical-align: inherit;\"> " + item.browse + "</font></font></span>\n" +
                        "                                    <span><i class=\"fa fa-comment-o\"></i><font style=\"vertical-align: inherit;\"><font\n" +
                        "                                            style=\"vertical-align: inherit;\"> " + item.comment + "</font></font></span>\n" +
                        "                                </div>\n" +
                        "                            </div>\n" +
                        "                        </div>\n";
                });
                k += "</div>\n" +
                    "                </div>";
                $("#show").html(k);
                console.log(response);
            },
            error: function (response) {
                console.log(response)
            }
        })
    }
}

/**
 *获取点赞数前十的文章信息并显示
 * @param tagName 标题
 */
function getIdBySupport(tagName) {
    $.ajax({
        type: 'POST',
        url: 'article/getIdBySupport',
        data:"pageNum=1&pageSize=10",
        success: function (response) {
            change(response, tagName);
            layui.use(['laypage', 'layer'], function () {
                var laypage = layui.laypage
                    , layer = layui.layer;
                laypage.render({
                    elem: 'pageHelper'
                    , count: response.total
                    , limit: response.pageSize
                    , curr: response.pageNum
                    , layout:
                        ['count', 'prev', 'page', 'next', 'skip']
                    , jump:
                        function (obj) {
                            console.log(obj);
                            $.ajax({
                                type: 'POST',
                                url: 'article/getIdBySupport',
                                data:"pageNum="+obj.curr+"&pageSize=10",
                                success: function (response) {
                                    change(response.list, tagName);
                                },
                                error: function (response) {
                                    console.log(response)
                                }
                            })
                        }
                })
                ;

            });
        },
        error: function (response) {
            console.log(response)
        }
    })
}

/**
 * 获取游览数前十的文章信息并显示
 * @param tagName 标题
 */
function getIdByBrowse(tagName) {
    $.ajax({
        type: 'POST',
        url: 'article/getIdByBrowse',
        data:"pageNum=1&pageSize=10",
        success: function (response) {
            change(response, tagName);
            layui.use(['laypage', 'layer'], function () {
                var laypage = layui.laypage
                    , layer = layui.layer;
                laypage.render({
                    elem: 'pageHelper'
                    , count: response.total
                    , limit: response.pageSize
                    , curr: response.pageNum
                    , layout:
                        ['count', 'prev', 'page', 'next', 'skip']
                    , jump:
                        function (obj) {
                            console.log(obj);
                            $.ajax({
                                type: 'POST',
                                url: 'article/getIdByBrowse',
                                data:"pageNum="+obj.curr+"&pageSize=10",
                                success: function (response) {
                                    change(response.list, tagName);
                                },
                                error: function (response) {
                                    console.log(response)
                                }
                            })
                        }
                })
                ;

            });
        },
        error: function (response) {
            console.log(response)
        }
    })
}

/**
 * 获时间最近前十的文章信息并显示
 * @param tagName 标题
 */
function getIdByTime(tagName) {
    $.ajax({
        type: 'POST',
        url: 'article/getIdByTime',
        data:"pageNum=1&pageSize=10",
        success: function (response) {
            change(response, tagName);
            layui.use(['laypage', 'layer'], function () {
                var laypage = layui.laypage
                    , layer = layui.layer;
                laypage.render({
                    elem: 'pageHelper'
                    , count: response.total
                    , limit: response.pageSize
                    , curr: response.pageNum
                    , layout:
                        ['count', 'prev', 'page', 'next', 'skip']
                    , jump:
                        function (obj) {
                            console.log(obj);
                            $.ajax({
                                type: 'POST',
                                url: 'article/getIdByTime',
                                data:"pageNum="+obj.curr+"&pageSize=10",
                                success: function (response) {
                                    change(response.list, tagName);
                                },
                                error: function (response) {
                                    console.log(response)
                                }
                            })
                        }
                })
                ;

            });
        },
        error: function (response) {
            console.log(response)
        }
    })
}

/**
 * 获取评论数前十的文章信息并显示
 * @param tagName 标题
 */

function changePage(response, url, tagName, data) {
    layui.use(['laypage', 'layer'], function () {
        var laypage = layui.laypage
            , layer = layui.layer;
        laypage.render({
            elem: 'pageHelper'
            , count: response.total
            , limit: response.pageSize
            , curr: response.pageNum
            , layout:
                ['count', 'prev', 'page', 'next', 'skip']
            , jump:
                function (obj) {
                    console.log(obj);
                    $.ajax({
                        type: 'POST',
                        url: url,
                        data: data + "&pageNum=" + obj.curr,
                        success: function (response) {
                            change(response.list, tagName);
                        },
                        error: function (response) {
                            console.log(response)
                        }
                    })
                }
        })
        ;

    });
}

function getIdByComment(tagName) {
    $.ajax({
        type: 'POST',
        url: 'article/getIdByComment',
        data:"pageNum=1&pageSize=10",
        success: function (response) {
            change(response, tagName);
            layui.use(['laypage', 'layer'], function () {
                var laypage = layui.laypage
                    , layer = layui.layer;
                laypage.render({
                    elem: 'pageHelper'
                    , count: response.total
                    , limit: response.pageSize
                    , curr: response.pageNum
                    , layout:
                        ['count', 'prev', 'page', 'next', 'skip']
                    , jump:
                        function (obj) {
                            console.log(obj);
                            $.ajax({
                                type: 'POST',
                                url: 'article/getIdByComment',
                                data:"pageNum="+obj.curr+"&pageSize=10",
                                success: function (response) {
                                    change(response.list, tagName);
                                },
                                error: function (response) {
                                    console.log(response)
                                }
                            })
                        }
                })
                ;

            });
        },
        error: function (response) {
            console.log(response)
        }
    })
}

/**
 * 根据时间获取的文章信息并显示
 * @param tagName 标题
 * @param dayBefore 时间距离
 */
function getIdByTimestamp(tagName, dayBefore) {
    $.ajax({
        type: 'POST',
        url: 'article/getIdByTimestamp',
        data: "dayBefore=" + dayBefore + "&pageNum=1&pageSize=10",
        success: function (response) {
            change(response.list, tagName);
            layui.use(['laypage', 'layer'], function () {
                var laypage = layui.laypage
                    , layer = layui.layer;
                laypage.render({
                    elem: 'pageHelper'
                    , count: response.total
                    , limit: response.pageSize
                    , curr: response.pageNum
                    , layout:
                        ['count', 'prev', 'page', 'next', 'skip']
                    , jump:
                        function (obj) {
                            console.log(obj);
                            $.ajax({
                                type: 'POST',
                                url: 'article/getIdByTimestamp',
                                data: "dayBefore=" + dayBefore + "&pageNum=" + obj.curr + "&pageSize=10",
                                success: function (response) {
                                    change(response.list, tagName);
                                },
                                error: function (response) {
                                    console.log(response)
                                }
                            })
                        }
                })
                ;

            });
        },
        error: function (response) {
            console.log(response)
        }
    })
}
