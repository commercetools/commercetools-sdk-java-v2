
package com.commercetools.history.models.common;

import java.util.Arrays;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public interface StateRole {

    StateRole REVIEW_INCLUDED_IN_STATISTICS = StateRoleEnum.REVIEW_INCLUDED_IN_STATISTICS;

    StateRole RETURN = StateRoleEnum.RETURN;

    enum StateRoleEnum implements StateRole {
        REVIEW_INCLUDED_IN_STATISTICS("ReviewIncludedInStatistics"),

        RETURN("Return");
        private final String jsonName;

        private StateRoleEnum(final String jsonName) {
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
    public static StateRole findEnum(String value) {
        return findEnumViaJsonName(value).orElse(new StateRole() {
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

    public static Optional<StateRole> findEnumViaJsonName(String jsonName) {
        return Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
    }

    public static StateRole[] values() {
        return StateRoleEnum.values();
    }
}
