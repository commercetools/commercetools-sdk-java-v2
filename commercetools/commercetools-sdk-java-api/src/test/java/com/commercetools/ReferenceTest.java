
package com.commercetools;

import static com.commercetools.TestUtils.stringFromResource;

import java.util.List;

import com.commercetools.api.models.common.GenericReference;
import com.commercetools.api.models.custom_object.GenericCustomObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;

import io.vrap.rmf.base.client.utils.json.JsonUtils;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class ReferenceTest {
    @Test
    public void customObjectReference() {
        final TypeReference<GenericReference<GenericCustomObject<Foo>>> typeReference = new TypeReference<GenericReference<GenericCustomObject<Foo>>>() {
        };

        GenericReference<GenericCustomObject<Foo>> reference = JsonUtils
                .fromJsonString(stringFromResource("custom-object-foo.json"), typeReference);

        Foo foo = reference.getObj().getValue();
        Assertions.assertThat(foo.getBars()).hasSize(2);
    }

    public static class Foo {
        @JsonProperty("bars")
        private List<Bar> bars;

        public Foo() {
        }

        public Foo(List<Bar> bars) {
            this.bars = bars;
        }

        public List<Bar> getBars() {
            return bars;
        }

        public void setBars(List<Bar> bars) {
            this.bars = bars;
        }
    }

    public static class Bar {
        @JsonProperty("number")
        private Integer number;
        @JsonProperty("name")
        private String name;

        public Bar() {
        }

        public Bar(Integer number, String name) {
            this.number = number;
            this.name = name;
        }

        public Integer getNumber() {
            return number;
        }

        public String getName() {
            return name;
        }

        public void setNumber(Integer number) {
            this.number = number;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
