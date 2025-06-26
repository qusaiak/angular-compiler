// 1⃣ متغيّر باسم فقط (بدون نوع ولا قيمة
let user;

// 2⃣ متغيّر باسم ونوع فقط
let user: string;

//️⃣ متغيّر باسم ونوع وقيمة
let count: number = 42;

// ️⃣ متغيّر باسم وقيمة فقط (بدون نوع)
const ready = true;

// ️⃣ const بنوع وقيمة إلزاميًا
const msg: string = "Hello";

// 6⃣ object literal كقيمة
let person = {
  name: "Ali",
  age: 30
};
// 7️⃣ متغيّر object بتحديد النوع أيضاً (معرف مسبقًا)
let student: {
  name: string,
  passed: boolean
} = {
  name: "Sara",
  passed: true
};

// 8️⃣ array مع النوع
let scores: number[] = [90, 80, 85];

// 9️⃣ array بدون نوع
const tags = ["html", "angular", "parser"];


// 1️⃣1️⃣ array of objects
let items: { title: string, price: number }[] = [
  { title: "منتج", price: 99.99 },
  { title: "خدمة", price: 49.5 }
];

// 1️⃣2️⃣ anonymous object كـ return
return {
  status: "ok",
  success: true
};

const greet = () => {
  console.log("Hi!");
};

