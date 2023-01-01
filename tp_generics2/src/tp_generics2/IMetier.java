package tp_generics2;

import java.util.List;

public interface IMetier<T> {
	  void add(T o);

	  List<T> getAll();

	  public T findById(long id);

	  void delete(long id);

}
