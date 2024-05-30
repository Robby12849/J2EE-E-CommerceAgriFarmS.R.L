async function inserisci(){
    var id_strumento = new URLSearchParams(window.location.search).get('id_strumento');
    var risp = await fetch("insertpagapp?id_strumento=" + id_strumento, {
        method : "POST"
    });
    if (risp.ok)
        alert("OGGETTO INSERITO CORRETTAMENTE");   
}
