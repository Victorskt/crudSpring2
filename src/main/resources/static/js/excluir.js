function deleteProfessor(id) {

    var btnDelete = document.getElementById("modalButtonDelete");
    btnDelete.setAttribute ("href", "/professor/remove/" + id);


}

function deleteStudent (id) {

    var btnDelete = document.getElementById("modalButtonDelete");
    btnDelete.setAttribute ("href", "/student/remove/" + id);


}