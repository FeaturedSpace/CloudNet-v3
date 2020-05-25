package de.dytanic.cloudnet.ext.syncproxy;

import de.dytanic.cloudnet.ext.syncproxy.configuration.SyncProxyConfiguration;
import de.dytanic.cloudnet.ext.syncproxy.configuration.SyncProxyConfigurationWriterAndReader;
import org.junit.Assert;
import org.junit.Test;

import java.io.File;

public final class SyncProxyConfigurationWriterAndReaderTest {

    @Test
    public void testWriterAndReader() {
        SyncProxyConfiguration bungeeConfiguration = SyncProxyConfigurationWriterAndReader.read(new File("build/sync_bungee.json"));

        Assert.assertNotNull(bungeeConfiguration);
        Assert.assertNotNull(bungeeConfiguration.getLoginConfigurations());
        Assert.assertNotNull(bungeeConfiguration.getTabListConfigurations());
    }
}