public interface Test {

	int countTaskAudioOfTeacher(String teacherId);
	
	int countCompleteTask(String teacherId);

	/* ================== */

	int addAgea();

	/* 看看这样行不行，这个我也不太清楚的*/
	List<Long> listAllotQuestionId(String teacherId);

	/*  再来加一下，我看看行不行，还有就是可以的  */
	/*  再来加一下，我看看行不行，还有就是可以的  */
	/*  再来加一下，我看看行不行，还有就是可以的  */

	/* mast */
	/* master*/
=======
	/*  这是一个分支，不知道是不是可以的  */

   	void releaseQuestionAllotStatus(List<Long> questionids);

	void lockQuestionAllotStatus(List<Long> questionids);
}