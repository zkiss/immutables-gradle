package test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

class UserTest {

    @Test
    public void should_format() {
        final var user = ImmutableUser.builder()
                .name("Mr Epoch")
                .birthDay(LocalDate.ofEpochDay(0))
                .build();

        Assertions.assertEquals(
                "User{name=Mr Epoch, birthDay=1970-01-01}",
                user.toString()
        );
    }

    @Test
    public void should_require_mandatory() {
        Assertions.assertThrows(IllegalStateException.class, () -> {
            ImmutableUser.builder().build();
        });
    }

}