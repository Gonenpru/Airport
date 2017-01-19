function navClicked(){
	var container = document.getElementById("selected");
	var clicked = document.getElementById(container.innerHTML);

	clicked.className += " active";
}