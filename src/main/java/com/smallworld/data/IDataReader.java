package com.smallworld.data;

import java.io.IOException;
import java.util.List;

public interface IDataReader<T> {

    List<T> readData(Class<T[]> value) throws IOException;
}
