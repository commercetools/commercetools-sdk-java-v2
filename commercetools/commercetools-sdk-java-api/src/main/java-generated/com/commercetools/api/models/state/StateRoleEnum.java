
package com.commercetools.api.models.state;

import java.util.Arrays;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public interface StateRoleEnum {

    StateRoleEnum REVIEW_INCLUDED_IN_STATISTICS = StateRoleEnumEnum.REVIEW_INCLUDED_IN_STATISTICS;

    StateRoleEnum RETURN = StateRoleEnumEnum.RETURN;

    enum StateRoleEnumEnum implements StateRoleEnum {
        REVIEW_INCLUDED_IN_STATISTICS("ReviewIncludedInStatistics"),

        RETURN("Return");
        private final String jsonName;

        private StateRoleEnumEnum(final String jsonName) {
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
    public static StateRoleEnum findEnum(String value) {
        return findEnumViaJsonName(value).orElse(new StateRoleEnum() {
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

    public static Optional<StateRoleEnum> findEnumViaJsonName(String jsonName) {
        return Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
    }

    public static StateRoleEnum[] values() {
        return StateRoleEnumEnum.values();
    }
}
