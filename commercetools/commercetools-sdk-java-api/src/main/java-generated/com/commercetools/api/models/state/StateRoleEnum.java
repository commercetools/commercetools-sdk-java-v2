package com.commercetools.api.models.state;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Arrays;
import java.util.Optional;
import io.vrap.rmf.base.client.JsonEnum;
import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>For some resource types, a State can fulfill the following predefined roles:</p>
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public interface StateRoleEnum extends JsonEnum {

    /**
    	<p>If a <a href="ctp:api:type:Review">Review's</a> <code>state</code> has this role its <code>rating</code> is taken into account for <a href="ctp:api:type:ReviewRatingStatistics">ReviewRatingStatistics</a>. This role only applies for the <code>ReviewState</code> <a href="ctp:api:type:StateTypeEnum">StateTypeEnum</a>.</p>
    	
    */
    StateRoleEnum REVIEW_INCLUDED_IN_STATISTICS = StateRoleEnumEnum.REVIEW_INCLUDED_IN_STATISTICS;
    /**
    	<p>Used by <a href="ctp:api:type:Order">Orders</a> in the update action <a href="ctp:api:type:OrderTransitionLineItemStateAction">transitionLineItemState</a>. This role only applies for the <code>LineItemState</code> <a href="ctp:api:type:StateTypeEnum">StateTypeEnum</a>.</p>
    	
    */
    StateRoleEnum RETURN = StateRoleEnumEnum.RETURN;
    
    /**
     * possible values of StateRoleEnum
     */
    enum StateRoleEnumEnum implements StateRoleEnum {
        /**
         * ReviewIncludedInStatistics
         */
        REVIEW_INCLUDED_IN_STATISTICS("ReviewIncludedInStatistics"),
        
        /**
         * Return
         */
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

    /**
     * the JSON value
     * @return json value
     */
    @JsonValue
    String getJsonName();

    /**
     * the enum value
     * @return name
     */
    String name();

    /**
     * convert value to string
     * @return string representation
     */
    String toString();

    /**
     * factory method for a enum value of StateRoleEnum
     * if no enum has been found an anonymous instance will be created
     * @param value the enum value to be wrapped
     * @return enum instance
     */
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

    /**
     * method to find enum using the JSON value
     * @param jsonName the json value to be wrapped
     * @return optional of enum instance
     */
    public static Optional<StateRoleEnum> findEnumViaJsonName(String jsonName) {
        return Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
    }
    
    /**
     * possible enum values
     * @return array of possible enum values
     */
    public static StateRoleEnum[] values() {
        return StateRoleEnumEnum.values();
    }
    
}
