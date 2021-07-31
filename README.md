#ScalaBasicWebCrawler-API
## Basic Web Crawler
[4.1] Extract Data from Source HTML
1. เขียนโปรแกรมเพื่อดึงข้อมูล URL ของ Logo ทุกบริษัท ที่อยู่ในส่วน “ใครมาบ้าง / PARTICIPATING STARTUPS” 
ในเว็บไซต์ The Internship (https://theinternship.io/) โดยข้อมูลต้นทางจะเป็น HTML และมีข้อมูลที่เป็น
URL ของ Logo แต่ละบริษัทอยู่ 
2. ให้ Output ข้อมูลโดยเรียงลำดับตามความยาวของ “คำอธิบายบริษัท” ซึ่งอยู่ใต้รูป โดยเรียงจากน้อยไปมาก 
3. ถ้ามีการเปลี่ยนแปลงจำนวนของบริษัทบนหน้าเว็บ (มีบริษัทเข้ามาใหม่ หรือ ออกจากโครงการ) เมื่อรันโปรแกรม
ใหม่ผลลัพธ์จะต้องเปลี่ยนไปตามข้อมูลบนหน้าเว็บจริง
ตัวอย่าง Output
company/wisible_logo.png 
company/codeapp_logo.png 
company/horganice_logo.png 
…
[4.2 - Optional] Extract Data from Source HTML 
ให้น้องๆ เอาข้อมูลที่ได้มาจากข้อ 4.1 มาเปิดเป็น JSON API สำหรับเข้าถึงข้อมูล โดยมี Spec ดังนี้
 - มี Route คือ /companies และรองรับเฉพาะ GET Request 
 - เมื่อเรียก API แล้วจะได้ JSON ที่มีโครงสร้างดังตัวอย่าง
 { "companies" : [ 
 { "logo": "https://theinternship.io/company/wisible_logo.png"}, 
 { "logo": "https://theinternship.io/company/codeapp_logo.png"} 
 ] }
โดยที่น้องๆ สามารถใช้ภาษาโปรแกรมไหนก็ได้, Framework ไหนก็ได้ที่ถนัด หรืออยากใช้ :-

## Franework & Extension library

1.Scala (Java 8)
2.Play framework (Java 8)
3.Jsoup 1.14.1
4.Gson 2.8.7

## Build and run the project

1.> sbt

2. [ScalaBasicWebCrawler-API] $ run

3. <http://localhost:9000/companies>
