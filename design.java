class User
{
    String uid;
    String details;
    List<question_id> questionList;
    List<answer_id> answerList;
    int rewards;


    function add/update/delete question();
    function add/update/delete answer();
    function add/update/delete comment();

}

class Moderator extends User
{
    function close or open question();
    function approve or disapprove answer();
    function addtag();
}

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