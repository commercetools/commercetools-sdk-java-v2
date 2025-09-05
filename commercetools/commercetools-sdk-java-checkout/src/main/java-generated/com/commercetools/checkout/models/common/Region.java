
package com.commercetools.checkout.models.common;

import java.util.Arrays;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import io.vrap.rmf.base.client.JsonEnum;
import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>The Region in which the Checkout application is <span>hosted</span>.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface Region extends JsonEnum {

    /**
    <p>for Europe (Google Cloud, Belgium)</p> */
    Region EUROPE_WEST1_GCP = RegionEnum.EUROPE_WEST1_GCP;
    /**
    <p>for North America (Google Cloud, Iowa)</p> */
    Region US_CENTRAL1_GCP = RegionEnum.US_CENTRAL1_GCP;
    /**
    <p>for Australia (Google Cloud, Sydney)</p> */
    Region AUSTRALIA_SOUTHEAST1_GCP = RegionEnum.AUSTRALIA_SOUTHEAST1_GCP;

    /**
     * possible values of Region
     */
    enum RegionEnum implements Region {
        /**
         * europe-west1.gcp
         */
        EUROPE_WEST1_GCP("europe-west1.gcp"),

        /**
         * us-central1.gcp
         */
        US_CENTRAL1_GCP("us-central1.gcp"),

        /**
         * australia-southeast1.gcp
         */
        AUSTRALIA_SOUTHEAST1_GCP("australia-southeast1.gcp");
        private final String jsonName;

        private RegionEnum(final String jsonName) {
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
     * factory method for a enum value of Region
     * if no enum has been found an anonymous instance will be created
     * @param value the enum value to be wrapped
     * @return enum instance
     */
    @JsonCreator
    public static Region findEnum(String value) {
        return findEnumViaJsonName(value).orElse(new Region() {
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
    public static Optional<Region> findEnumViaJsonName(String jsonName) {
        return Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
    }

    /**
     * possible enum values
     * @return array of possible enum values
     */
    public static Region[] values() {
        return RegionEnum.values();
    }

}
