$(".like").click(function(e) {
    var btn = $(e.currentTarget);
    var postId = btn.attr("data-post-id");

    btn.attr("disabled", "disabled");

    $.post("/post/" + postId + "/like", (data) => {
        btn.text(data + " ❤");
        btn.removeClass("btn-secondary").addClass("btn-danger");
        btn.removeAttr("disabled");
    });
});