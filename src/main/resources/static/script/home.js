document.addEventListener("DOMContentLoaded", function () {
    // Get the values from Thymeleaf
    var failMessage = document.getElementById("fail-message")?.textContent.trim();
    var passMessage = document.getElementById("pass-message")?.textContent.trim();
    var popup = document.getElementById("popup");
    // Show popup if there's a message
    if (failMessage) {
        popup.innerText = failMessage;
        popup.style.background = "rgba(255, 0, 0, 0.8)"; // Red for failure
        popup.style.color = "white";
    } else if (passMessage) {
        popup.innerText = passMessage;
        popup.style.background = "rgba(0, 128, 0, 0.8)"; // Green for success
        popup.style.color = "white";
    }

    if (failMessage || passMessage) {
        popup.style.display = "block";

        // Hide after 10 seconds
        setTimeout(() => {
            popup.style.display = "none";
        }, 2000);
    }
});

/*document.addEventListener("DOMContentLoaded", function () {
           let failMessage = document.getElementById("fail-message").innerText;
           let passMessage = document.getElementById("pass-message").innerText;
           let popup = document.getElementById("popup");

           if (failMessage) {
               popup.innerText = failMessage;
               popup.classList.add("fail");
               popup.style.display = "block";
           } else if (passMessage) {
               popup.innerText = passMessage;
               popup.classList.add("pass");
               popup.style.display = "block";
           }

           // Hide popup after 3 seconds
           setTimeout(() => {
               popup.style.display = "none";
           }, 3000);
       });*/

	   
	   
	   