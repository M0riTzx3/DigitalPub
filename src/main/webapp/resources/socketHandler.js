var sock = new SockJS('127.0.0.1:8100/home');
sock.onopen = function() {
    console.log('open');
    sock.send('test');
};