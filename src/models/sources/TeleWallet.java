package src.models.sources;

public class TeleWallet implements FundingSource {

    @Override
    public TransferProvider getProvider() {
        return null;
    }
}