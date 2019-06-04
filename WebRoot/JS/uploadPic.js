function uploadF() {
	var filename = document.getElementById('fu').value;
	if (filename != "" || filename != null) {
		var fileText = filename.substring(filename.lastIndexOf("."),
				filename.length);
		fileText = fileText.toLowerCase();
		if (fileText == '.png' || fileText == '.bmp' || fileText == '.png'
				|| fileText == '.gif' || fileText == '.jpg') {
			return true;
		}
	}
	alert("Please select the file as required!");
	return false;
};

