$(document).ready(function () {
    $("button").click(function () {
        $.get("https://vk.com/i.sysoev2000", function (data, status) {
            alert("Data: " + data + "\nStatus: " + status);
            console.log("Data: " + data + "\nStatus: " + status);
            
        });
    });
});
