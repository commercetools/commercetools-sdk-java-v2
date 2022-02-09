
package com.commercetools.api.models.state;

import java.util.Arrays;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import io.vrap.rmf.base.client.utils.Generated;

/**
*  <p>For some resource types, a State can fulfill the following predefined roles:</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public interface StateRoleEnum {

    /**
    	<p>If a <a href="ctp:api:type:Review">Review's</a> <code>state</code> has this role its <code>rating</code> is taken into account for <a href="ctp:api:type:ReviewRatingStatistics">ReviewRatingStatistics</a>. This role only applies for the <code>ReviewState</code> <a href="ctp:api:type:StateTypeEnum">StateTypeEnum</a>.</p>

    */
    StateRoleEnum REVIEW_INCLUDED_IN_STATISTICS = StateRoleEnumEnum.REVIEW_INCLUDED_IN_STATISTICS;
    /**
    	<p>Used by <a href="ctp:api:type:Order">Orders</a> in the update action <a href="ctp:api:type:OrderTransitionLineItemStateAction">transitionLineItemState</a>. This role only applies for the <code>LineItemState</code> <a href="ctp:api:type:StateTypeEnum">StateTypeEnum</a>.</p>

    */
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

        public String toString() {
            return jsonName;
        }
    }

    @JsonValue
    String getJsonName();

    String name();

    String toString();

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

            public String toString() {
                return value;
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
