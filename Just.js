console.log("jahangirP");

let n = [5, 9, 15, 20]
let m = [1, 3, 6, 8, 19, 35]

let nLenght = n.length
let mLenght = m.length

function s(n, m , nl, ml){
    let newArr = []
    let ni = 0;
    let mi = 0;
    let newi= 0;
    let i = 0;
    while(i < nl+ml){

        
        if(n[ni] < m[mi]){
            newArr[newi] = n[ni]
            newi++;
            ni++;
        }else{
            newArr[newi] = m[mi];
            newi++;
            mi++;
        }
        i++;
    }
    return newArr;

}

console.log(s(n, m, nLenght, mLenght));
