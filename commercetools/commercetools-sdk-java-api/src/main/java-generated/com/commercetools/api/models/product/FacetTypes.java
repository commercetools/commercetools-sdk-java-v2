
package com.commercetools.api.models.product;

import java.util.Arrays;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public interface FacetTypes {

    FacetTypes TERMS = FacetTypesEnum.TERMS;

    FacetTypes RANGE = FacetTypesEnum.RANGE;

    FacetTypes FILTER = FacetTypesEnum.FILTER;

    enum FacetTypesEnum implements FacetTypes {
        TERMS("terms"),

        RANGE("range"),

        FILTER("filter");
        private final String jsonName;

        private FacetTypesEnum(final String jsonName) {
            this.jsonName = jsonName;
        }

        public String getJsonName() {
            return jsonName;
        }
    }

    @JsonValue
    String getJsonName();

    String name();

    @JsonCreator
    public static FacetTypes findEnum(String value) {
        return findEnumViaJsonName(value).orElse(new FacetTypes() {
            @Override
            public String getJsonName() {
                return value;
            }

            @Override
            public String name() {
                return value.toUpperCase();
            }
        });
    }

    public static Optional<FacetTypes> findEnumViaJsonName(String jsonName) {
        return Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
    }

    public static FacetTypes[] values() {
        return FacetTypesEnum.values();
    }
}
