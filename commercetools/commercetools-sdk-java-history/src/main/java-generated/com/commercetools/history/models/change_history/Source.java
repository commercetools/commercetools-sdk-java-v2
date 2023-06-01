package com.commercetools.history.models.change_history;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Arrays;
import java.util.Optional;
import io.vrap.rmf.base.client.JsonEnum;
import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Values for the Source enumeration.</p>
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public interface Source extends JsonEnum {

    
    Source MERCHANT_CENTER = SourceEnum.MERCHANT_CENTER;
    
    Source IMP_EX = SourceEnum.IMP_EX;
    
    Source API_CLIENT = SourceEnum.API_CLIENT;
    
    /**
     * possible values of Source
     */
    enum SourceEnum implements Source {
        /**
         * MerchantCenter
         */
        MERCHANT_CENTER("MerchantCenter"),
        
        /**
         * ImpEx
         */
        IMP_EX("ImpEx"),
        
        /**
         * ApiClient
         */
        API_CLIENT("ApiClient");
        private final String jsonName;

        private SourceEnum(final String jsonName) {
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
     * factory method for a enum value of Source
     * if no enum has been found an anonymous instance will be created
     * @param value the enum value to be wrapped
     * @return enum instance
     */
    @JsonCreator
    public static Source findEnum(String value) {
        return findEnumViaJsonName(value).orElse(new Source() {
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
    public static Optional<Source> findEnumViaJsonName(String jsonName) {
        return Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
    }
    
    /**
     * possible enum values
     * @return array of possible enum values
     */
    public static Source[] values() {
        return SourceEnum.values();
    }
    
}
