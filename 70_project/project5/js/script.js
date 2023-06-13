// 문서가 준비되면 함수 실행
$(function () {

    // 내비게이션바
    $('.main > li > a').mouseenter(function (e) {
        // a태그 기본 이벤트 제거
        e.preventDefault();
        $('.sub').stop().slideDown(400);
        $('.nav_bg').stop().animate({ height: 180 }, 400);
    });
    $('nav').mouseleave(function () {
        $('.sub').stop().slideUp(400);
        $('.nav_bg').stop().animate({ height: 0 }, 400);
    });

    // 비디오 자동플레이
    // $('video').get(0).play();

    // 섹션1 케로셀
    const slider = $('.slider').bxSlider({
        mode: 'horizontal',
        // mode: 'vertical',
        // mode: 'fade',
        // 자동 슬라이드
        auto: true,
        // 컨트롤 버튼(좌우, 페이저)를 클릭하면 auto 슬라이드 일시 정지
        stopAutoOnClick: true,
        // 슬라이드 위에 hover하면 auto 일시정지
        autoHover: true,
        // 실행/일시정지 버튼
        // autoControls: true,
        // 인디케이터 버튼
        pager: false,
        // 이전 이후 버튼
        controls: false,
        // 전환 시간
        speed: 400,
        // 지연 시간
        pause: 3000,
        // 슬라이드 전환 직전에 autoPager() 함수를 호출하여 동작 시킴
        onSlideBefore: function () {
            autoPager();
        },
        // 슬라이드 전환 직후 txtMotion() 함수를 호출하여 동작 시킴
        onSlideAfter: function () {
            txtMotion();
        }
    });

    function txtMotion() {
        // 슬라이드 전환 직후의 텍스트 모션
        $('#slideWrap .slider li div').animate({ top: 0, opacity: 1 });
    }

    function autoPager() {
        // 페이저의 이미지 변경
        // 페이저 a태그의 active 클래스 모두 제거
        $('#slideWrap .pager a').removeClass('active');
        // 현재 슬라이드 번호를 가져와서 current에 저장한다.
        var current = slider.getCurrentSlide();
        $('#slideWrap .pager a').eq(current).addClass('active');

        // 슬라이드 전환 직전의 텍스트 모션
        $('#slideWrap .slider li div').css({ top: 100, opacity: 0 });
    }

    // 페이저 버튼
    $('#slideWrap .pager a').click(function (e) {
        // a태그의 기본이벤트 제거
        e.preventDefault();
        let num = $(this).index();
        slider.goToSlide(num);
        return false;
    });

    // 이전 버튼
    $('#slideWrap #prev').click(function (e) {
        e.preventDefault();
        slider.goToPrevSlide();
        autoPager();
        return false;
    });
    // 이후 버튼
    $('#slideWrap #next').click(function (e) {
        e.preventDefault();
        slider.goToNextSlide();
        autoPager();
        return false;
    });

    // 풀페이지 레이아웃
    $('.section').mousewheel(function (e, delta) {
        let prev;
        if (delta > 0) {
            prev = $(this).prev().offset().top;
            console.log(prev);
            $('html').stop().animate({ scrollTop: prev }, 400, 'easeOutExpo');
        } else if (delta < 0) {
            let next = $(this).next().offset().top;
            console.log(next);
            $('html').stop().animate({ scrollTop: next }, 400, 'easeOutExpo');
        }
    });
});