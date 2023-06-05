

/* 
    제이쿼리
    $(function(){});

    자바스크립트
    document.addEventListener('DOMContentLoaded', function () {});
 */
// 문서의 DOM내용을 전부 읽은 후 함수를 실행 시킨다.
document.addEventListener('DOMContentLoaded', function () {


    const yy = document.querySelector('.yy');
    const mo = document.querySelector('.mm');
    const dd = document.querySelector('.dd');
    const we = document.querySelector('.we');
    const hh = document.querySelector('.hh');
    const mi = document.querySelector('.mi');
    const sc = document.querySelector('.ss');

    setInterval(timer, 1000);
    function timer() {
        let d = new Date();

        //  년(yyyy)
        yy.innerHTML = d.getFullYear() + '년';

        //  월(mm) : 0(1월) ~ 11(12월)
        mo.innerHTML = d.getMonth() + 1 + '월';

        //  일(dd)
        dd.innerHTML = d.getDate() + '일';

        //  요일(week)
        let week = d.getDay();

        if (week === 0) {
            week = "일";
        }
        else if (week == 1) {
            week = '월';
        }
        else if (week == 2) {
            week = '화';
        }
        else if (week == 3) {
            week = '수';
        }
        else if (week == 4) {
            week = '목';
        }
        else if (week == 5) {
            week = '금';
        }
        else {
            week = '토';
        }
        we.innerHTML = week;


        let hour = d.getHours();

        if (hour >= 13 && hour < 24) {

            hour = (hour - 12) + 'pm';
        }
        else if (hour == 24) {
            hour -= 12
            hour = (hour - 12) + 'am';
        }
        else if (hour == 12) {

            hour = hour + 'pm';
        }
        else {
            hour = hour + 'am';
        }
        hh.innerHTML = hour;
        // 분(mm)
        let mm = d.getMinutes();
        if (mm < 10) {
            mm = '0' + mm;
        }
        mi.innerHTML = mm + '분';

        // 초(ss)
        // 01 ~ 09 ~10 ~60
        let ss = d.getSeconds();
        if (ss < 10) {
            ss = '0' + ss;
        }

        sc.innerHTML = ss + '초';
    }
})




