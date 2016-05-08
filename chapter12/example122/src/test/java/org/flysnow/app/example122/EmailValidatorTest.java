package org.flysnow.app.example122;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * @author 飞雪无情
 * @since 16-5-9 上午12:02
 */
public class EmailValidatorTest {
    @Test
    public void emailValidator_CorrectEmailSimple_ReturnsTrue() {
        assertThat(EmailValidator.isValidEmail("name@email.com"), is(true));
    }
    @Test
    public void emailValidator_CorrectEmailSimple_ReturnsFalse() {
        assertThat(EmailValidator.isValidEmail("name"), is(false));
    }
}
