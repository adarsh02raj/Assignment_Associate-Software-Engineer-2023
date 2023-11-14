function submitForm() {
    
    const firstName = document.getElementById('firstName').value;
    const lastName = document.getElementById('lastName').value;
    const dob = document.getElementById('dob').value;
    const country = document.getElementById('country').value;

    
    const genderCheckboxes = document.querySelectorAll('input[name="gender"]:checked');
    if (genderCheckboxes.length === 0) {
        alert('Please select a gender.');
        return false;
    }
    else if(genderCheckboxes.length > 1){
        alert("You can't choose more than one option");
        return false;
    }
    
    const gender = Array.from(genderCheckboxes).map(checkbox => checkbox.value);

    const profession = document.getElementById('profession').value;
    const email = document.getElementById('email').value;
    const mobile = document.getElementById('mobile').value;

    
    const message = `Survey Submission:\n\n
        First Name: ${firstName}\n
        Last Name: ${lastName}\n
        Date of Birth: ${dob}\n
        Country: ${country}\n
        Gender: ${gender}\n
        Profession: ${profession}\n
        Email: ${email}\n
        Mobile Number: ${mobile}`;

    alert(message);

    
    document.getElementById('surveyForm').reset();

    return false;
}
