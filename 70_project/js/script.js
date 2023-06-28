// 프로그래스바
$(function () {
    let state = 0;

    $(window).scroll(function () {
        if ($(this).scrollTop() >= 1800) {
            if (state === 0) {
                pgbar(0, 95);
                pgbar(1, 85);
                pgbar(2, 75);
                state = 1;
            } else
                return;
        } else
            state = 0;

    });


    function pgbar(idx, maxCnt) {
        const elem = $(".progress");
        let w = 0;
        const timer = setInterval(bar, 30);

        function bar() {
            if (w >= maxCnt) {
                clearInterval(timer);
            } else {
                w++;
                elem.eq(idx).find('div').css({ width: w + "%" });
                elem.eq(idx).find('div').text(w + "%");
            }
        }
    }
    // 카운터
    const elem = $('#counter span');
    let conterState = 0;

    $(window).scroll(function () {
        // 윈도우 스크롤이 2150이상이면
        if ($(this).scrollTop() >= 2150) {
            if (conterState === 0) {
                move(0, 32, 100);
                move(1, 8, 200);
                move(2, 4, 300);
                move(3, 3, 400);
                conterState = 1;
            } else
                return;

        } else
            conterState = 0;
    });

    function move(idx, maxCnt, mSec) {
        let num = 0;
        //counter 함수를 0.2초마다 실행
        //setInterval : 일정 시간(ms) 간격으로 함수를 반복적으로 실행(실행할 함수, 시간 간격)
        const timer = setInterval(counter, mSec);
        function counter() {
            if (num >= maxCnt) {
                //clearInterval : setInterval을 이용하여 실행중인 반복 종료
                clearInterval(timer);
            } else {
                num++;
                elem.eq(idx).text(`${num}+`);
            }
        }
    }
})


