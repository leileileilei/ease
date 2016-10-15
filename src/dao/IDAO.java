package dao;
import java.util.List;
import beans.User;
public interface IDAO {
		public abstract User create(User stu) throws Exception;
		public abstract void remove(User stu) throws Exception;
		public abstract User find(User stu) throws Exception;
		public abstract List<User> findAll() throws Exception;
		public abstract void update(User stu) throws Exception;
}


