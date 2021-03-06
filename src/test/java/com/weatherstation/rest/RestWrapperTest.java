package com.weatherstation.rest;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.verify;

@ExtendWith({MockitoExtension.class})
public class RestWrapperTest {

    @Mock
    RestCall restCall;

    @Test
    void shouldCallPostMethod() {
        RestWrapper restWrapper = new RestWrapper();
        double[] ds18b20Data = {20.7, 25.3, 30.2, 55.8};
        double[] bme280Data = {5.5, 980, 60};

        restWrapper.sendDataOverRest("url", ds18b20Data, bme280Data, "password", restCall, 1);

        verify(restCall)
                .post("url", new double[]{20.7, 25.3, 30.2, 55.8}, new double[]{5.5, 980, 60}, "password", 1);
    }
}
