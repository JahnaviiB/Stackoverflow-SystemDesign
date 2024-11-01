class User
{
    String uid;
    String details;
    List<question_id> questionList;
    List<answer_id> answerList;
    int rewards;
    String interests;



    function add/update/delete question();
    function add/update/delete/upvote answer();
    function add/update/delete comment();
    funtion request clubroom();
    funtcion join community();
 

}

class Moderator extends User
{
    function close or open question();
    function approve or disapprove answer();
    function addtag();
}

class EduUser extends User
    {
    String eduid;
    String details;
    List<question_id> questionList;
    List<answer_id> answerList;
    int rewards;
    String interests;


    function add/update/delete question();
    function add/update/delete/upvote answer();
    function add/update/delete comment();
    funtion request clubroom();
    funtcion join community(); 

}

class DE extends User
    {

    String uid;
    String details(bio);
    List<question_id> questionList;
    List<answer_id> answerList;
    int rewards;
    String interests;

    function add/update/delete question();
    function add/update/delete/upvote answer();
    function add/update/delete comment();
    funtion create clubroom();
    funtion build community();
        

class question
{
    String questionId;
    String questionTitle;
    String questionDesc;
    String user_id;
    Time questionadded;
    Vote vote;
    List<Tag> tagList;
    List<answer_id> AnswerList;
    List<comment_id> CommentList;
}

class Answer
{
    String answerId;
    String questionId;
    String owner_id;
    String ans;
    List<comment_id> commentList;
    Time answerAdded;

}

enum CommentType
{
    QUESTION_COMMENT,ANSWER_COMMENT;
}
class Comment
{
    String commentId;
    String user_id;
    Time commentAdded;
    String commentStr;
    CommentType commentType;
}

class Tag
{
    String user_id;
    String tagStr;
}

class Vote
{
    String user_id;
    String totalUpvote;
    String totalDownvote;
 
}

class Community
    {
        String 
