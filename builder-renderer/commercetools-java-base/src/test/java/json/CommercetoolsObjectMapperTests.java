package json;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.time.*;

public class CommercetoolsObjectMapperTests {
    
    private static final int TEST_YEAR = 2010;
    private static final int TEST_MONTH = 11;
    private static final int TEST_DAY = 12;
    private static final int TEST_HOUR_OFFSET = 10;
    private static final int TEST_HOUR_UTC = 9;
    private static final int TEST_MINUTE = 11;
    private static final int TEST_SECOND = 12;
    private final LocalDate TEST_LOCAL_DATE = LocalDate.of(TEST_YEAR, TEST_MONTH, TEST_DAY);
    private final LocalTime TEST_LOCAL_TIME = LocalTime.of(TEST_HOUR_OFFSET, TEST_MINUTE, TEST_SECOND);
    private final ZoneId zoneId = ZoneId.ofOffset("UTC", ZoneOffset.ofHours(1));
    
    @Test
    public void serializeZonedDateTime() throws JsonProcessingException {
        ZonedDateTime zonedDateTime = ZonedDateTime.of(TEST_LOCAL_DATE, TEST_LOCAL_TIME, zoneId);
        String serializedZonedDateTime = CommercetoolsJsonUtils.toJsonString(zonedDateTime);
        Assert.assertEquals(serializedZonedDateTime, "\"2010-11-12T09:11:12.000Z\"");
    }
    
    @Test
    public void serializeLocalDate() throws JsonProcessingException {
        String serializedLocalDate = CommercetoolsJsonUtils.toJsonString(TEST_LOCAL_DATE);
        Assert.assertEquals(serializedLocalDate, "\"2010-11-12\"");
    }
    
    @Test
    public void serializeLocalTime() throws JsonProcessingException {
        String serializedLocalTime = CommercetoolsJsonUtils.toJsonString(TEST_LOCAL_TIME);
        Assert.assertEquals(serializedLocalTime, "\"10:11:12\"");
    }
    
    @Test
    public void deserializeZonedDateTime() throws IOException {
        String zonedDateTimeSerialized = "\"2010-11-12T09:11:12.000Z\"";
        ZonedDateTime zonedDateTime = CommercetoolsJsonUtils.fromJsonString(zonedDateTimeSerialized, ZonedDateTime.class);
        Assert.assertEquals(zonedDateTime.getYear(), TEST_YEAR);
        Assert.assertEquals(zonedDateTime.getMonth(), Month.of(TEST_MONTH));
        Assert.assertEquals(zonedDateTime.getDayOfMonth(), TEST_DAY);
        Assert.assertEquals(zonedDateTime.getHour(), TEST_HOUR_UTC);
        Assert.assertEquals(zonedDateTime.getMinute(), TEST_MINUTE);
        Assert.assertEquals(zonedDateTime.getSecond(), TEST_SECOND);
    }
    
    @Test
    public void deserializeLocalDate() throws IOException {
        String localDateSerialized = "\"2010-11-12\"";
        LocalDate localDate = CommercetoolsJsonUtils.fromJsonString(localDateSerialized, LocalDate.class);
        Assert.assertEquals(localDate.getDayOfMonth(), TEST_DAY);
        Assert.assertEquals(localDate.getMonth(), Month.of(TEST_MONTH));
        Assert.assertEquals(localDate.getDayOfMonth(), TEST_DAY);
    }
    
    @Test
    public void deserializeLocalTime() throws IOException {
        String localTimeSerialized = "\"10:11:12\"";
        LocalTime localTime = CommercetoolsJsonUtils.fromJsonString(localTimeSerialized, LocalTime.class);
        Assert.assertEquals(localTime.getHour(), TEST_HOUR_OFFSET);
        Assert.assertEquals(localTime.getMinute(), TEST_MINUTE);
        Assert.assertEquals(localTime.getSecond(), TEST_SECOND);
    }
}