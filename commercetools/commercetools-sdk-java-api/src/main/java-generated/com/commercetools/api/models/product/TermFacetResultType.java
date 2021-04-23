
package com.commercetools.api.models.product;

import java.util.Arrays;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public interface TermFacetResultType {

    TermFacetResultType TEXT = TermFacetResultTypeEnum.TEXT;

    TermFacetResultType DATE = TermFacetResultTypeEnum.DATE;

    TermFacetResultType TIME = TermFacetResultTypeEnum.TIME;

    TermFacetResultType DATETIME = TermFacetResultTypeEnum.DATETIME;

    TermFacetResultType BOOLEAN = TermFacetResultTypeEnum.BOOLEAN;

    TermFacetResultType NUMBER = TermFacetResultTypeEnum.NUMBER;

    enum TermFacetResultTypeEnum implements TermFacetResultType {
        TEXT("text"),

        DATE("date"),

        TIME("time"),

        DATETIME("datetime"),

        BOOLEAN("boolean"),

        NUMBER("number");
        private final String jsonName;

        private TermFacetResultTypeEnum(final String jsonName) {
            this.jsonName = jsonName;
        }

        public String getJsonName() {
            return jsonName;
        }

        public String toString() {
            return jsonName;
        }
    }

    @JsonValue
    String getJsonName();

    String name();

    String toString();

    @JsonCreator
    public static TermFacetResultType findEnum(String value) {
        return findEnumViaJsonName(value).orElse(new TermFacetResultType() {
            @Override
            public String getJsonName() {
                return value;
            }

            @Override
            public String name() {
                return value.toUpperCase();
            }

            public String toString() {
                return value;
            }
        });
    }

    public static Optional<TermFacetResultType> findEnumViaJsonName(String jsonName) {
        return Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
    }

    public static TermFacetResultType[] values() {
        return TermFacetResultTypeEnum.values();
    }
}
