const sentence = "This is a sunny day";
let words = sentence.split(" ");

let ans = "";

function Reverse(words){
    for (let i = 0; i < words.length; i++) {

        let num = words[i].length;
        let chars = words[i];
        //reverse traversing of each word
        for(let j=num-1; j>=0; j--){
            ans+=chars[j]
        }
        //Adding space after every reversed word
        ans+=" ";
    }
    console.log(ans);
}

Reverse(words);
