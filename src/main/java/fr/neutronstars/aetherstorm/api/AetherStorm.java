/**
 * Copyright 2021 NeutronStars
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package fr.neutronstars.aetherstorm.api;

import fr.neutronstars.aetherstorm.api.cache.Entities;
import fr.neutronstars.aetherstorm.api.command.Commands;
import fr.neutronstars.aetherstorm.api.configuration.Configuration;
import fr.neutronstars.aetherstorm.api.database.Database;
import fr.neutronstars.aetherstorm.api.entity.Guild;
import fr.neutronstars.aetherstorm.api.entity.Player;
import fr.neutronstars.aetherstorm.api.language.Languages;
import fr.neutronstars.aetherstorm.core.text.LevenshteinDistance;
import net.dv8tion.jda.api.entities.User;
import net.dv8tion.jda.api.sharding.ShardManager;
import org.slf4j.Logger;

public interface AetherStorm
{
    Logger getLogger();

    Configuration getConfiguration();

    ShardManager getShardManager();

    Commands getCommands();

    Languages getLanguages();

    Entities<Guild, net.dv8tion.jda.api.entities.Guild> getGuilds();

    Entities<Player, User> getPlayers();

    Database getDatabase();

    String getJDAVersion();

    String getAetherStormVersion();

    LevenshteinDistance getLevenshteinDistance();
}
