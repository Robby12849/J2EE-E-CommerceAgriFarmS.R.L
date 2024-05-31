async function inserisci(id_strumento){
    var risp = await fetch("insertpagapp?id_strumento=" + id_strumento, {
        method : "POST"
    });  
}


