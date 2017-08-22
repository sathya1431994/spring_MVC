package pack.dao;
import pack.model.*;
import java.util.*;
public interface DataDao
{
    void add(Data d);
    List<Data> show(Data d);
    void delete(Data d);
}