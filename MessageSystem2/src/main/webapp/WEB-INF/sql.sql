select * from WEB_MESSAGE;

INSERT INTO WEB_MESSAGE
VALUES (num_message.nextval, 'test', 'test', 'test', sysdate);

delete from WEB_MESSAGE where RECEIVEEMAIL = 'test';