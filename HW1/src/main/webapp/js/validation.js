function ValidationForm() {
	let regex = /^\d+$/;
	var text;
	var num1 = document.forms["myForm"]["txtNum1"].value;
	var num2 = document.forms["myForm"]["txtNum2"].value;
	var btn1 = document.querySelector("#btn1");
	var btn2 = document.querySelector("#btn2");
	var btn3 = document.querySelector("#btn3");
	var btn4 = document.querySelector("#btn4");
	if (num1 == "" || !regex.test(num1)) {
		text = " Number 1 not match !";
		document.getElementById("error1").innerHTML = text;
		btn1.disabled = true;
		btn2.disabled = true;
		btn3.disabled = true;
		btn4.disabled = true;
		return false;
	} else {
		document.getElementById("error1").innerHTML = "";
	}
	if (num2 == "" || !regex.test(num2)) {
		text = " Number 2 not match !";
		document.getElementById("error2").innerHTML = text;
		btn1.disabled = true;
		btn2.disabled = true;
		btn3.disabled = true;
		btn4.disabled = true;
		return false;
	} else {
		document.getElementById("error2").innerHTML = "";
	}
	btn1.disabled = false;
	btn2.disabled = false;
	btn3.disabled = false;
	btn4.disabled = false;

}