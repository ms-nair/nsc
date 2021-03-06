/*
    Network Signal Coder -- a utility that converts binary
        sequences into standard network physical signals.

    Copyright (C) 2015-2017  Nick Ivanov <nnrowan@gmail.com>

    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/

package nsc;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.Objects;

public class NSC extends Application {
    @Override
    public void start(Stage primaryStage) {
        int defaultWidth = Integer.parseInt(Objects.requireNonNull(NSCPropertyHelper.getProperty("default_width")).trim());
        int defaultHeight = Integer.parseInt(Objects.requireNonNull(NSCPropertyHelper.getProperty("default_height")).trim());

        RootContainer rootContainer = new RootContainer(primaryStage);
        Scene scene = new Scene(rootContainer, defaultWidth, defaultHeight);
        primaryStage.setTitle(NSCPropertyHelper.getProperty("application_name"));
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
