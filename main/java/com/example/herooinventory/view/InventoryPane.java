package com.example.herooinventory.view;

import com.example.herooinventory.Launcher;
import com.example.herooinventory.model.item.BasedEquipment;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.DragEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;

import java.util.ArrayList;

import static com.example.herooinventory.controller.AllCustomHandler.onDragDetected;
import static com.example.herooinventory.controller.AllCustomHandler.onEquipDone;

public class InventoryPane extends ScrollPane {
    private ArrayList<BasedEquipment> equipmentArray;
    public InventoryPane() {}
    private Pane getDetailsPane() {
        Pane inventoryInfoPane = new HBox(10);
        inventoryInfoPane.setBorder(null);
        inventoryInfoPane.setPadding(new Insets(25, 25, 25, 25));
        if (equipmentArray != null) {
            ImageView[] imageViewList = new ImageView[equipmentArray.size()];
            for (int i = 0; i < equipmentArray.size(); i++) {
                imageViewList[i] = new ImageView();
                imageViewList[i].setPreserveRatio(true);
                imageViewList[i].setFitHeight(40);
                imageViewList[i].setFitWidth(40);
                imageViewList[i].setImage(new Image(Launcher.class.getResource(
                        equipmentArray.get(i).getImagepath()).toString()));
                int finalI = i;
                imageViewList[i].setOnDragDetected(new EventHandler<MouseEvent>() {
                    public void handle(MouseEvent event) {
                        onDragDetected(event, equipmentArray.get(finalI), imageViewList[finalI]);
                    }
                });
                imageViewList[i].setOnDragDone(new EventHandler<DragEvent>() {
                    @Override
                    public void handle(DragEvent event) {
                        onEquipDone(event);
                    }
                });
            }
            inventoryInfoPane.getChildren().addAll(imageViewList);
        }
        return inventoryInfoPane;

    }
    public void drawPane(ArrayList<BasedEquipment> equipmentArray) {
        this.equipmentArray = equipmentArray;
        Pane invetoryInfo = getDetailsPane();
        this.setStyle("-fx-background-color:Red;");
        this.setContent(invetoryInfo);
    }

}
