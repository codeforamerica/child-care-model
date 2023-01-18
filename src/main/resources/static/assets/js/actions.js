
function toggleAskNumberOfChildren() {
    if (document.getElementById("childrenNotNeedingCare-Yes-label").getAttribute('class') === 'radio-button is-selected') {
        document.getElementById("children-not-needing-care").style.display = 'block';
    } else {
        document.getElementById("children-not-needing-care").style.display = 'none';
    }
}

function toggleAskJob(){
    if (document.getElementById("currentlyWorking-Yes-label").getAttribute('class') === 'radio-button is-selected') {
        // display ask about job + hide ask about
        document.getElementById("job-info").style.display = 'block';
        document.getElementById("searching-for-employment").style.display = 'none';
    } else if (document.getElementById("currentlyWorking-No-label").getAttribute('class') === 'radio-button is-selected') {
        document.getElementById("job-info").style.display = 'none';
        document.getElementById("searching-for-employment").style.display = 'block';
        // display ask about hide job
    } else {
        document.getElementById("job-info").style.display = 'none';
        document.getElementById("searching-for-employment").style.display = 'none';

    }
}