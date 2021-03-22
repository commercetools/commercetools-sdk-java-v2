package io.vrap.rmf.base.client.utils.json;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.assertj.core.api.Assertions;
import org.junit.Test;

public class NumberTest {
    interface NumberTestValue {
        Double getNumber();
    }

    @Test
    public void serializeNumbers() throws JsonProcessingException {

        Assertions.assertThat(JsonUtils.toJsonString((NumberTestValue) () -> 13.0)).isEqualTo("{\"number\":13.0}");
        Assertions.assertThat(JsonUtils.toJsonString((NumberTestValue) () -> 13.1)).isEqualTo("{\"number\":13.1}");
    }
}
