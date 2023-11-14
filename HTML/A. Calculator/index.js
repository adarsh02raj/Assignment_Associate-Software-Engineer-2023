let currentInput = '';
let currentOperation = '';
let firstOperand = null;

function clearDisplay() {
    currentInput = '';
    currentOperation = '';
    firstOperand = null;
    updateDisplay();
}

function appendValue(value) {
    currentInput += value;
    updateDisplay();
}

function setOperation(operation) {
    if (currentInput !== '') {
        if (firstOperand !== null) {
            calculate();
        }
        firstOperand = parseFloat(currentInput);
        currentInput = '';
        currentOperation = operation;
        updateDisplay();
    }
}

function calculate() {
    if (currentInput !== '' && firstOperand !== null) {
        const secondOperand = parseFloat(currentInput);
        let result;

        switch (currentOperation) {
            case '+':
                result = firstOperand + secondOperand;
                break;
            case '-':
                result = firstOperand - secondOperand;
                break;
            case '*':
                result = firstOperand * secondOperand;
                break;
            case '/':
                result = firstOperand / secondOperand;
                break;
        }

        currentInput = result.toString();
        currentOperation = '';
        firstOperand = null;
        updateDisplay();
    }
}

function updateDisplay() {
    document.getElementById('display').value = currentInput;
}
