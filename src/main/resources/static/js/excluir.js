function deleteProfessor(id) {

    var btnDelete = document.getElementById("modalButtonDelete");
    btnDelete.setAttribute ("href", "/professor/remove/" + id);


}