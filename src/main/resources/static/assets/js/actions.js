
function toggleVisibility() {
    if (document.getElementById("childrenNotNeedingCare-Yes-label").getAttribute('class') === 'radio-button is-selected') {
        document.getElementById("children-not-needing-care").style.display = 'block';
    } else {
        document.getElementById("children-not-needing-care").style.display = 'none';
    }
}