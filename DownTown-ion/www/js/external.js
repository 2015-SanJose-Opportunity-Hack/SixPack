function loadForm() {
    localStorage.setItem('comments',document.getElementsByTagName('textarea')[0].value);
    window.location.href = "form-view.html";
}

function uploadData() {

    var elements = document.getElementsByTagName('input');
    for (var i=0;i<elements.length;i++) {
        localStorage.setItem(elements[i].id, elements[i].value);
    }

    getFormData();
}

function returnHome() {

    window.location.href = "index.html";
}

function checkLocalData() {
    var elements = document.getElementsByTagName("input"),
        element;
    for (var i=0;i<elements.length;i++) {
        element = localStorage.getItem(elements[i].id);
        if(element != "" || element !== undefined) {
            document.getElementById(elements[i].id).value = element;
        }
    }
}

