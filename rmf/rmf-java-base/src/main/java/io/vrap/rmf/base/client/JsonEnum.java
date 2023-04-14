
package io.vrap.rmf.base.client;

public interface JsonEnum {
    /**
     * the JSON value
     * @return json value
     */
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
}
