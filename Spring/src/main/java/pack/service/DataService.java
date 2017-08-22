package pack.service;
import pack.model.*;
import java.util.*;
public interface DataService
{
    void add(Data d);
    List<Data> show(Data d);
    void delete(Data d);
}