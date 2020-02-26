package test;

import org.immutables.value.Value;

import java.time.LocalDate;

@Value.Immutable
public interface User {
    String name();

    LocalDate birthDay();
}
