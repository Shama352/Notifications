package observer;

import users.Professor;
import users.Student;
import users.TA;

public interface Subject {
	void subscribeProfessorForEmailNotification(Professor professor);

	void subscribeProfessorForSMSNotification(Professor professor);

	void subscribeTAForEmailNotification(TA ta);

	void subscribeTAForSMSNotification(TA ta);

	void subscribeStudentForEmailNotification(Student student);

	void subscribeStudentForSMSNotification(Student student);

	void notifyAllUsers(String[] placeholders);

}
